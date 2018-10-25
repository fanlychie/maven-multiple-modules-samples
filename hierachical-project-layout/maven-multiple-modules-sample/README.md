```html
maven-multiple-modules-project  // 父模块项目
  |
  |— pom.xml (pom)
  |
  |— user-facade                    // 子模块项目, 用户接口层
  |      |— src
  |      |— pom.xml (jar)
  |
  |— user-service                   // 子模块项目, 用户业务层
  |      |— src
  |      |— pom.xml (jar)
  |
  |— blog-web                       // 子模块项目, 访问控制层
  |      |— src
  |      |— pom.xml (war)
  |
```