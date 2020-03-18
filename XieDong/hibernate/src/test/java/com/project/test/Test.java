package com.project.test;
import	java.text.SimpleDateFormat;
import java.util.Date;

import com.project.entity.RoleEntity;
        import com.project.entity.UserEntity;
import com.project.util.HibernateSession;
        import org.hibernate.Session;
        import org.hibernate.Transaction;


public class Test {
    @org.junit.Test
    public void test(){
        UserEntity user =new UserEntity("战是干","678",23);
       // user.setId(1);
        Session s=HibernateSession.createSession();
        //获取事务控制
        Transaction ts=s.getTransaction();
        //开启事务控制
        ts.begin();
        //执行添加
        s.save(user);
        ts.commit();
        s.close();

    }
    @org.junit.Test
    public void update(){
        Session s=HibernateSession.createSession();
        //获取事务控制
        Transaction ts=s.getTransaction();
        //开启事务控制
        ts.begin();

        //先得到要修改的对象
        UserEntity user= s.get(UserEntity.class,1);
        user.setAge(20);
        s.update(user);
ts.commit();
s.close();


    }
    @org.junit.Test
    public void getUser(){
        Session s=HibernateSession.createSession();
       UserEntity user= s.get(UserEntity.class,1);
        System.out.println(user.getName());

        s.close();
    }
    @org.junit.Test
    public void delete(){
        Session s=HibernateSession.createSession();
        //获取事务控制
        Transaction ts=s.getTransaction();
        //开启事务控制
        ts.begin();
        UserEntity user=new UserEntity();
       // user.setId(1);
        s.delete(user);

        ts.commit();
        s.close();
    }
@org.junit.Test
    public  void  addRoleTest(){
        Session s=HibernateSession.createSession();
        //获取事务控制
        Transaction ts=s.getTransaction();
        //开启事务控制
        ts.begin();

        RoleEntity  role=new RoleEntity();


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");

        String date=sdf.format(new Date());
        role.setAddDate(date);

        role.setInfo("有什么程序能用来证明数学知识呢？要理解这个问题，咱们把机器放一边，先来想一下，我们人类是怎么做数学题的。比如，如果让你算39*57等于多少，你没法一下子算出来，就得按部就班地算了：先列个式子，从个位开始按乘法口诀计算，记录中间结果，还得逢十进位。当然，也不排除有的人是“超级大脑”，一下子就能算出来，中间不需要任何有意识的步骤。\n" +
                "看出来有什么规律了吗？有两点是很显然的：第一，对于人类来说，是不是需要程序来做数学，跟直觉能力成反比。直觉能力越强，就越不需要按部就班地计算步骤；直觉越弱，就越需要程序来保证结果的正确性。但是机器本身是没有任何直觉能力的。要让它来做数学，就得按直觉最弱的极端情况来处理，也就是任何简单的计算，都需要有详细的程序来执行。\n" +
                "那怎么设计这个程序呢？这就是第二条规律，如果你进行计算，那这几个步骤是不能少的：你得先把总的计算任务分解成若干个小步骤，比如列式子；然后你得按规则完成其中的每一个小步骤，比如按加法规则或乘法口诀来计算；而且你还得有一个记录中间结果的载体。算39*57，你得找一张纸列式子，个位十位的结果要分别记下来；即使你心算不用纸，那你的记忆就是载体。\n" +
                "设计这种让机器做数学的程序，其实跟我们人类需要的计算步骤是非常相通的。这也正是图灵用来思考机械可判定性问题的思路，就是我们刚刚总结的三个特点：\n" +
                "一是，人类的计算程序，都得把运算任务分解成一系列最简单的小步骤。而在假想的机器上，图灵也要求所有的运算都分解成一系列最基本的操作，每一个操作都意味着机器内部状态的变化。\n" +
                "二是，人类的程序都要按照规则完成每一个小步骤，而图灵也要求假想的机器能够根据规则，决定内部的状态。机器可以选择保持现有状态，或者选择进入新的状态。\n" +
                "三是，人类的计算还得有个方便记录的载体，能够记下所有中间步骤的结果。而图灵想得更彻底，他直接假想这样的机器需要有无限长的纸带，不管中间的运算或证明过程多么复杂，需要多么长的步骤，都能被事无巨细地记下来。机器自带一个打印头，可以在纸带上左右移动，能完成写下新符号、保留现有符号，或者是清除符号留下的空格这些操作。\n" +
                "说到这里，大名鼎鼎的“图灵机”就已经呼之欲出了。其实，图灵最初的想法是把它当作一个思想实验，用来思考数学知识究竟能不能由机器来证明。他最后否定了这个可能性，但从这个思考中产生的图灵机，却是个更有价值的收获。人类科学进步的历史常常就是这样，无心插柳柳成荫，很多重要的成就往往是在探索其他方向上时意外获得的。在当时，也就是1950年代初，图灵敏锐地意识到了它的重要，进一步提出了“计算机（Computer）”这个全新的概念。");
        role.setPowerStr("系统管理");

        s.save(role);
        ts.commit();
        s.close();



    }
@org.junit.Test
    public void getSession(){
        HibernateSession.createSession();
    }
}
