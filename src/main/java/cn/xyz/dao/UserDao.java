package  cn.xyz.dao;
import cn.xyz.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao{
   /**
    * 新增注册
    * @param username
    * @param password
    */
//   @Insert("insert user (username,password) values (#{username},#{password})")
   public void inserUser(String username,String password);

   /**
    * 查询登入
    * @param username
    * @param password
    * @return
    */
//   @Select("select * from user where username = #{username} and password = #{password}")
   public User selectUser(String username,String password);

}