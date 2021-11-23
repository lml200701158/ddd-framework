# ddd-framework
DDD框架

/README.md [error opening dir]
./ddd-application  // 业务层
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
│                           ├── exception
│                           │   ├── ServiceException.java
│                           │   └── ValidationException.java
│                           ├── result
│                           │   ├── BaseResult.javar
│                           │   ├── Page.java
│                           │   ├── PageResult.java
│                           │   └── Result.java
│                           └── util
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
                            ├── domain // 领域对象
                            │   └── AuthorizeDO.java
                            ├── dto // DTO
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
./ddd-infra  // 存储层
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
├── ddd-api  // 应用层
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
│           └── resources // 资源文件
│               ├── application.yml
│           └── resources // 资源
│               └── init.sql
└── ddd-task
    └── pom.xml
./pom.xml
