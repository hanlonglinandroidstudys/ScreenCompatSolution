# 屏幕适配方案

## intruduce 屏幕适配基础知识介绍


## screenCompat1 
* 屏幕适配方案1: 宽高限定符适配
    * * 特点： 谷歌提供，系统自动匹配当前分辨率下的dimens文件。
    * * 缺点： 需要手动添加和计算各种分辨率下的宽高，为每一种屏幕分辨率都做适配。

## screenCompat2
* 屏幕适配方案2: 来自鸿阳开源项目：https://github.com/hongyangAndroid/AndroidAutoLayout适配
    * * 特点： 通过在测量时按照比例重新设置子控件的宽高来达到适配。
    * * 缺点： 代码侵入性强，必须使用第三方提供的布局或者继承第三方的Activity。

## screenCompat3 
* 屏幕适配方案3: sw限定符适配,或者smallestWidth适配。是android3.2之后引入的。谷歌原本是针对平板适配的，不过实践发现对手机也不错。
    * * 特点：
        >  android会识别屏幕可用高度和宽度的最小尺寸的dp值，然后根据识别到的值去资源文件中寻找对应限定符的文件夹下的资源文件。
        
        >  容错机制： 如果没有values-sw392dp,系统会向下寻找，比如values-sw392dp 最近是values-sw391dp
   
        >  自动生成sw文件方式：
            >> 1. 代码方式： https://github.com/ladingwu/dimens_sw
            >> 2. as插件方式： https://github.com/wildma/ScreenAdaptation
    * * 缺点：资源较多，增加体积

## screenCompat4
* 屏幕适配方案4: 今日头条适配方案
    * * 特点：
        > 将任意屏幕宽度（比如：1080px），除以设计稿宽度的值（360dp），得到1dp对应的px,然后将这个值设置给系统的density,导致系统再将dp转化为px的时候会按照我们的比例来进行转换，完成屏幕适配。
       
        > 原计算方式 density= dpi / 160
        
        > 新计算方式 density= 设备真实宽度（比如1080px）/设计稿宽度的值（比如360dp）
    
    * * 缺点：