package com.update.plugin.timer

import org.gradle.api.Plugin
import org.gradle.api.Project


/**
 * @author : liupu
 * date   : 2019/9/14
 * desc   : 打印 每个模块花费的时间
 * github : https://github.com/CodeLiuPu/
 */
class TimerPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.gradle.addListener(new TimerListener())
    }

}