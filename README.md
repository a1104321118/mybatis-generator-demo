# mybatis-generator-demo

```
利用 mybatis-generator 的 maven 插件进行生成


```

## 使用方法
```
1.下载后修改 jdbc.properties对应的配置
2.执行一下 mvn install(因为mbg的bug，会导致找不到某些用到的本身包的类 
                      eg.com.hr.base.CommentHelper)
3.执行 mvn org.mybatis.generator:mybatis-generator-maven-plugin:1.3.5:generate
  或 利用idea的maven窗口 plugins->mybatis-generator->mybatis-generator:generate
```

## 注意事项
```
1.不存在的文件夹不需要创建，会自动创建
2.重复生成的时候xml文件会追加，不会覆盖，需要自行删除
```