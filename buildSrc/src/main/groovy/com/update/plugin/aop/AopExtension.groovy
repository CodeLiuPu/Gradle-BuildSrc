package com.update.plugin.aop


/**
 * @author : liupu
 * date   : 2019/9/12
 * desc   : aop配置信息
 * github : https://github.com/CodeLiuPu/
 */
class AopExtension {
    public static final String EXT_NAME = 'pluginAop'

    static final DEFAULT_EXCLUDE = [
            '.*/R(\\\$)?.*'
            , '.*/BuildConfig$'
    ]
    String aopClass = ''

    @Override
    String toString() {
        StringBuilder sb = new StringBuilder('andAop {')
        sb.append('\n\t')
        sb.append('\n\t]\n}')
        return super.toString()
    }
}