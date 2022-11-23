package com.test;

import com.registry.RegistryKey;

/**
 * @className: RegeditTest
 * @author: Lin
 * @描述: 获取 win10注册表信息  (jregistry-1.8.3.jar)
 * @date: 2022/11/22 2:03
 * @version: 1.0
 */
public class RegeditTest {
    public static void main(String[] args) {
        //注册表
        //HKEY_LOCAL_MACHINE\HARDWARE\DESCRIPTION\System\BIOS\SystemProductName                       <Z3 Pro>
        //HKEY_LOCAL_MACHINE\HARDWARE\DESCRIPTION\System\CentralProcessor\0\ProcessorNameString       <CPU>
        //HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\DisplayVersion              <系统版本号>
        //HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Update\TargetingInfo\Installed\Client.OS.rs2.amd64\Version

        String key = "\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Update\\TargetingInfo\\Installed\\Client.OS.rs2.amd64\\";
        RegistryKey regKey = new RegistryKey(RegistryKey.getRootKeyForIndex(RegistryKey.HKEY_LOCAL_MACHINE_INDEX),key);

        if (regKey.getValue("Version") != null) {
            System.out.println("Windows系统内部版本为:\n"+regKey.getValue("Version").toString());
        }else {
            System.out.println("没有找到key值! ");
        }


        //System(本机)
       /* resp.getWriter().println("架构: "+System.getProperty("os.arch").toLowerCase()+"<br>");
        resp.getWriter().println("版本: "+System.getProperty("os.version").toLowerCase()+"<br>");
        resp.getWriter().println("账户名: "+System.getProperty("user.name")+"<br>");
        resp.getWriter().println("当前目录: "+System.getProperty("user.dir")+"<br>");
        resp.getWriter().println("Java虚拟机实现名称: "+System.getProperty("java.vm.name")+"<br>");*/

    }
}
