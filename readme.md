springbootdemo

主要是用于演示的，测试相关信息，看源码

https://blog.csdn.net/iku5200/article/details/82856621


期间问题：
1. 本地mysql版本：8.0.20，这个版本是高版本
2. mysql的高版本的加密方式，如下：
>+------------------+-----------+-----------------------+
>| user             | host      | plugin                |
>+------------------+-----------+-----------------------+
>| mysql.infoschema | localhost | caching_sha2_password |
>| mysql.session    | localhost | caching_sha2_password |
>| mysql.sys        | localhost | caching_sha2_password |
>| root             | localhost | mysql_native_password |
>+------------------+-----------+-----------------------|

原来的加密方式是：caching_sha2_password，后来由于客户端无法连接，然后将加密方式降级了，
变成了mysql_native_password，这样客户端就能连接了，
但是代码中还是连接有问题，原因也是因为useSSL造成的，本地修改成useSSL=false了，解决问题了，
参考博客：
https://blog.csdn.net/a745233700/article/details/80419136
https://www.cnblogs.com/pp153/p/9097891.html

