package com.update.plugin.aop


import org.gradle.api.Plugin
import org.gradle.api.Project

class AopPlugin implements Plugin<Project> {
    final String taskName = "task_aop"

    @Override
    void apply(Project project) {
        project.task(taskName){
            println "Hello Aop"
        }
    }
}