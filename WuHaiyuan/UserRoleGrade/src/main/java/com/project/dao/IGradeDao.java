package com.project.dao;

import com.project.entity.GradeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IGradeDao extends CrudRepository<GradeEntity,Integer> {

    /**
     * 查询所有权限
     * @return 权限实体集合
     */
    @Query("FROM GradeEntity ")
    public List<GradeEntity> findAll();

    /**
     * 根据用户id查询该用户所有的权限
     * @param userId 用户id
     * @return 权限实体集合
     */
    @Query(value = "SELECT g.* FROM  t_grade g,t_role_grade rg,t_role r,t_user_role ur WHERE g.pk_id = rg.fk_gradeId and r.pk_id = rg.fk_roleId\n" +
            "AND r.pk_id = ur.fk_roleId AND fk_userId = ?1" ,nativeQuery = true)
    public List<GradeEntity> findGradeByUserId(int userId);
}
