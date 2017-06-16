package com.lin.dao;  
  
  
import com.lin.domain.User;  
  
/** 
 * 功能概要：User的DAO类 
 *   
 */  
public interface UserDao {
    public User selectUserById(Integer id);  
  
}  