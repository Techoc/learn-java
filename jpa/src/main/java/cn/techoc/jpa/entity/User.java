package cn.techoc.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "t_user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 8655851615465363473L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, // strategy 设置使用数据库主键自增策略
            generator = "JDBC") //generator 设置插入完成后，查询最后生成的 ID 填充到该属性中.
    private Integer id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    // 忽略该字段的映射
    @Transient
    private String email;

    @Column(name = "create_time", nullable = false)
    private Date createTime;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

}
