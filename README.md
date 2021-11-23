# ddd-framework
DDD脚手架

## 为何编写此脚手架

- 解决编写过程式和事务代码，造成后期维护逻辑混乱、维护成本高的痛点；
- 抛弃MVC框架，拥抱更适合复杂业务的开发框架；
- 将DDD落地，通过脚手架的改变，推动DDD思想的讨论学习发芽

## 此脚手架坚持的原则

- 以领域驱动（DDD）设计为基础，分层清楚，做默认规范

## 为何要强制分层

- 高内聚低耦合，提高各个层次间的复用性，减少模块间接口的复杂程度
- 各个层次中的变化不影响其上层和下层
- 层次分明便于mock和查找问题，各个层次间异常处理机制可控

## 项目结构
```
./ddd-application  // 应用层
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── ddd
                    └── applicaiton
                        ├── converter
                        │   └── UserApplicationConverter.java // 类型转换器
                        └── impl
                            └── AuthrizeApplicationServiceImpl.java // 业务逻辑
./ddd-common
├── ddd-common // 通用类库
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── com
│                   └── ddd
│                       └── common
│                           ├── exception // 异常
│                           │   ├── ServiceException.java
│                           │   └── ValidationException.java
│                           ├── result // 返回结果集
│                           │   ├── BaseResult.javar
│                           │   ├── Page.java
│                           │   ├── PageResult.java
│                           │   └── Result.java
│                           └── util // 通用工具
│                               ├── GsonUtil.java
│                               └── ValidationUtil.java
├── ddd-common-application // 业务层通用模块
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── com
│                   └── ddd
│                       └── applicaiton
│                           ├── dto // DTO
│                           │   ├── RoleInfoDTO.java
│                           │   └── UserRoleDTO.java
│                           └── servic // 业务接口
│                               └── AuthrizeApplicationService.java
├── ddd-common-domain
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── com
│                   └── ddd
│                       └── domain
│                           ├── event // 领域事件
│                           │   ├── BaseDomainEvent.java
│                           │   └── DomainEventPublisher.java
│                           └── service // 领域接口
│                               └── AuthorizeDomainService.java
└── ddd-common-infra
    ├── pom.xml
    └── src
        └── main
            └── java
                └── com
                    └── ddd
                        └── infra
                            ├── domain // DO
                            │   └── AuthorizeDO.java
                            ├── dto 
                            │   ├── AddressDTO.java
                            │   ├── RoleDTO.java
                            │   ├── UnitDTO.java
                            │   └── UserRoleDTO.java
                            └── repository
                                ├── UserRepository.java // 领域仓库
                                └── mybatis
                                    └── entity // PO
                                        ├── BaseUuidEntity.java
                                        ├── RolePO.java
                                        ├── UserPO.java
                                        └── UserRolePO.java
./ddd-domian  // 领域层
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── ddd
                    └── domain
                        ├── event // 领域事件
                        │   ├── DomainEventPublisherImpl.java
                        │   ├── UserCreateEvent.java
                        │   ├── UserDeleteEvent.java
                        │   └── UserUpdateEvent.java
                        └── impl // 领域逻辑
                            └── AuthorizeDomainServiceImpl.java
./ddd-infra  // 基础服务层
├── pom.xml
└── src
    └── main
        └── java
            └── com
                └── ddd
                    └── infra
                        ├── config
                        │   └── InfraCoreConfig.java  // 扫描Mapper文件
                        └── repository
                            ├── converter
                            │   └── UserConverter.java // 类型转换器
                            ├── impl
                            │   └── UserRepositoryImpl.java
                            └── mapper
                                ├── RoleMapper.java
                                ├── UserMapper.java
                                └── UserRoleMapper.java
./ddd-interface
├── ddd-api  // 用户接口层
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── com
│           │       └── ddd
│           │           └── api
│           │               ├── DDDFrameworkApiApplication.java // 启动入口
│           │               ├── converter
│           │               │   └── AuthorizeConverter.java // 类型转换器
│           │               ├── model
│           │               │   ├── req // 入参 req
│           │               │   │   ├── AuthorizeCreateReq.java
│           │               │   │   └── AuthorizeUpdateReq.java
│           │               │   └── vo  // 输出 VO
│           │               │       └── UserAuthorizeVO.java
│           │               └── web     // API
│           │                   └── AuthorizeController.java
│           └── resources // 系统配置
│               ├── application.yml
│           └── resources // Sql文件
│               └── init.sql
└── ddd-task
    └── pom.xml
./pom.xml
```

## 功能测试
### 1. 新建库表
- 通过文件"ddd-interface/ddd-api/src/main/resources/init.sql"新建库表。

### 2. 修改SQL配置
- 修改"ddd-interface/ddd-api/src/main/resources/application.yml"的数据库配置。

### 3. 启动服务
- 直接启动服务即可。

### 4. 测试用例

- 请求URL：http://127.0.0.1:8087/api/user/save
- Post body：{"userName":"louzai","realName":"楼","phone":13123676844,"password":"***","unitId":2,"province":"湖北省","city":"鄂州市","county":"葛店开发区","roles":[{"roleId":2}]}
- 更多测试用例详见"AuthorizeController.java"

## 维护者

楼仔（微信公众号"楼仔进阶之路")