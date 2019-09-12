package com.update.plugin.aop


import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * @author : liupu
 * date   : 2019/9/12
 * desc   : AopPlugin 入口类
 * github : https://github.com/CodeLiuPu/
 */
class AopPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println 'helloya'
    }

    /**
     * 读取自定义配置信息
     */
    void readExtension(Project project) {
        println 'project(' + project.name + ') apply aop plugin'
        // 读取自定义配置
        project.extensions.create(AopExtension.EXT_NAME, AopExtension)
        project.afterEvaluate {
            init(project)//此处要先于transformImpl.transform方法执行
        }
    }

    static void init(Project project) {
        AopExtension extension = project.extensions.findByName(AopExtension.EXT_NAME) as AopExtension
        project.logger.error AopExtension.EXT_NAME + ' configuration is:\n' + extension.toString()
        project.logger.error extension.aopClass
    }
}