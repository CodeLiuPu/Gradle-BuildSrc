package com.update.plugin.hello


import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author : liupu
 * date   : 2019/9/12
 * desc   : 输出 HelloWorld
 * github : https://github.com/CodeLiuPu/
 */
class HelloPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        String bool = ""
        if (bool){
            println 'Hello Gradle'
        } else {
            println 'World Gradle'
        }
    }
}