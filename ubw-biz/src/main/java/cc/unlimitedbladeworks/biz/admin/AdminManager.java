/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cc.unlimitedbladeworks.biz.admin;

/**
 * @FileName AdminManager.java
 * @date Aug 23, 2016
 * @time 9:34:42 AM
 * @author Allen Zhao
 * @Description description of the class
 * @version 1.00 9999/99/99 Allen Zhao
 * <p> 9.99 9999/99/99 modifier : modify description </p>
 * @see reference class
 */
public interface AdminManager {
    
    void init();
    
    void refreshValues();

    void increaseIndexClick();
    
    long getIndexClick();
}
