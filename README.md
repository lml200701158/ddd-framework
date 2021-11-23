# ddd-framework
DDD框架


<p style="margin:0;">./ddd-application&nbsp; // 业务层</p><p style="margin:0;">├── pom.xml</p><p style="margin:0;">└── src</p><p style="margin:0;">&nbsp; &nbsp; └── main</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; └── java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── com</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── ddd</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── applicaiton</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── converter</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;└── UserApplicationConverter.java // 类型转换器</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── impl</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── AuthrizeApplicationServiceImpl.java // 业务逻辑</p><p style="margin:0;">./ddd-common</p><p style="margin:0;">├── ddd-common // 通用类库</p><p style="margin:0;">│&nbsp; &nbsp;├── pom.xml</p><p style="margin:0;">│&nbsp; &nbsp;└── src</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp;└── main</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── com</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── ddd</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── common</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── exception</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;├── ServiceException.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;└── ValidationException.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── result</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;├── BaseResult.javar</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;├── Page.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;├── PageResult.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;└── Result.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── util</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── GsonUtil.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── ValidationUtil.java</p><p style="margin:0;">├── ddd-common-application // 业务层通用模块</p><p style="margin:0;">│&nbsp; &nbsp;├── pom.xml</p><p style="margin:0;">│&nbsp; &nbsp;└── src</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp;└── main</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── com</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── ddd</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── applicaiton</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── dto // DTO</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;├── RoleInfoDTO.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;└── UserRoleDTO.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── servic // 业务接口</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── AuthrizeApplicationService.java</p><p style="margin:0;">├── ddd-common-domain</p><p style="margin:0;">│&nbsp; &nbsp;├── pom.xml</p><p style="margin:0;">│&nbsp; &nbsp;└── src</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp;└── main</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── com</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── ddd</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── domain</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── event // 领域事件</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;├── BaseDomainEvent.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;└── DomainEventPublisher.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── service // 领域接口</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── AuthorizeDomainService.java</p><p style="margin:0;">└── ddd-common-infra</p><p style="margin:0;">&nbsp; &nbsp; ├── pom.xml</p><p style="margin:0;">&nbsp; &nbsp; └── src</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; └── main</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── com</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── ddd</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── infra</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── domain // 领域对象</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;└── AuthorizeDO.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── dto // DTO</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;├── AddressDTO.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;├── RoleDTO.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;├── UnitDTO.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;└── UserRoleDTO.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── repository</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── UserRepository.java // 领域仓库</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── mybatis</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── entity // PO</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── BaseUuidEntity.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── RolePO.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── UserPO.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── UserRolePO.java</p><p style="margin:0;">./ddd-domian&nbsp; // 领域层</p><p style="margin:0;">├── pom.xml</p><p style="margin:0;">└── src</p><p style="margin:0;">&nbsp; &nbsp; └── main</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; └── java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── com</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── ddd</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── domain</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── event // 领域事件</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;├── DomainEventPublisherImpl.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;├── UserCreateEvent.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;├── UserDeleteEvent.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;└── UserUpdateEvent.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── impl // 领域逻辑</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── AuthorizeDomainServiceImpl.java</p><p style="margin:0;">./ddd-infra&nbsp; // 存储层</p><p style="margin:0;">├── pom.xml</p><p style="margin:0;">└── src</p><p style="margin:0;">&nbsp; &nbsp; └── main</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; └── java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── com</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── ddd</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── infra</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── config</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;└── InfraCoreConfig.java&nbsp; // 扫描Mapper文件</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── repository</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── converter</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;└── UserConverter.java // 类型转换器</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── impl</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; │&nbsp; &nbsp;└── UserRepositoryImpl.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── mapper</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── RoleMapper.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; ├── UserMapper.java</p><p style="margin:0;">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; └── UserRoleMapper.java</p><p style="margin:0;">./ddd-interface</p><p style="margin:0;">├── ddd-api&nbsp; // 应用层</p><p style="margin:0;">│&nbsp; &nbsp;├── pom.xml</p><p style="margin:0;">│&nbsp; &nbsp;└── src</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp;└── main</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;└── com</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp;└── ddd</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── api</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── DDDFrameworkApiApplication.java // 启动入口</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── converter</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;└── AuthorizeConverter.java // 类型转换器</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── model</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;├── req // 入参 req</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;│&nbsp; &nbsp;├── AuthorizeCreateReq.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;│&nbsp; &nbsp;└── AuthorizeUpdateReq.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp;└── vo&nbsp; // 输出 VO</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp;└── UserAuthorizeVO.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── web&nbsp; &nbsp; &nbsp;// API</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── AuthorizeController.java</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── resources // 资源文件</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;├── application.yml</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── resources // 资源</p><p style="margin:0;">│&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;└── init.sql</p><p style="margin:0;">└── ddd-task</p><p style="margin:0;">&nbsp; &nbsp; └── pom.xml</p><p style="margin:0;">./pom.xml</p>
