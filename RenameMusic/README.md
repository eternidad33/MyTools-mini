# 批量重命名音乐文件

详细设计步骤可参考我的[博客](https://blog.csdn.net/qq_42907802/article/details/105515777)

### 背景

从酷狗音乐下载音乐时，发现下载的音乐的文件名都是以歌手开头，看着很难受，而且在酷狗的下载设置里没有下载的文件名设置。

![KuGou下载设置](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/TIM截图20200330175150.png)

### 程序需求

将文件名为`歌手 - 音乐名.后缀`的音乐文件批量修改为`音乐名-歌手.后缀`的样式

### 实现效果

![实现效果](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/RenameMusic.gif)

### 思路

1. 获取音乐文件
2. 利用正则改名
3. 文件改名
4. 简单地设计一下界面

### 代码结构

```powershell
PS \RenameMusic> tree /f
卷 软件 的文件夹 PATH 列表
卷序列号为 54DD-69A2
E:.
│  README.md
│  RenameMusic.iml
│
└─src
    ├─controller
    │      RenameUtil.java
    │
    ├─META-INF
    │      MANIFEST.MF
    │
    └─view
            Start.form
            Start.java
```

`RenameUtil.java`是重命名的相关操作

`Start.java`是启动界面