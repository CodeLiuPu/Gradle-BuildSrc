package com.update.plugin.hello


import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project> {

    final String taskName = "task_hello"
    @Override
    void apply(Project project) {
        project.task(taskName){
            println "Hello Gradle"
        }
    }
}