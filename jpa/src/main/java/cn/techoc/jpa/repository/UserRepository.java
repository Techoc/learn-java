package cn.techoc.jpa.repository;

import cn.techoc.jpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 查询结果
     */
    List<User> findAllByUsername(String username);

    Page<User> findByUsernameAndPassword(String username, String password, Pageable pageable);

    @Query("SELECT u FROM User u WHERE u.username = ?1")
    User findByUsername01(String username); // <1>

    @Query("SELECT u FROM User u WHERE u.username = :username")
    User findByUsername02(@Param("username") String username); // <2>

    @Query(value = "SELECT * FROM users u WHERE u.username = :username", nativeQuery = true)
    User findByUsername03(@Param("username") String username); // <3>

    @Query("UPDATE User  u SET u.username = :username WHERE u.id = :id")
    @Modifying
    int updateUsernameById(Integer id, String username); // <4>
}
