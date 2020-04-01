# 将仓库文件链接转换成Markdown格式

### 背景

在GitHub的README文件中为自己的文章生成目录，由于一行一行的重复类似的代码，一个一个的打字比较麻烦，所以就想到设计一个程序转换Markdown格式。

### 程序需求

将仓库文件链接转换成Markdown格式。

### 实现效果

![toMDLink](https://cdn.jsdelivr.net/gh/eternidad33/picbed@master/img/toMDLink.gif)

### 思路

1. 获取文件目录
2. 将其中的文件名转换成`[文件名](文件路径)`格式
3. 输出运行结果

### 代码结构

```powershell
PS E:\MyTools-mini\FileNameToMDLink\src> tree /f
卷 软件 的文件夹 PATH 列表
卷序列号为 54DD-69A2
E:.
├─controller
│      FileUtil.java
│
├─META-INF
│      MANIFEST.MF
│
└─view
        FileNameToMDLinkStart.form
        FileNameToMDLinkStart.java
```

`FileUtil.java`生成Markdown链接

`FileNameToMDLinkStart.java`：启动界面

