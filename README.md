项目名称：藤木教育

项目介绍：藤木教育一个为8~16岁儿童提供编程技能教育的在线网络课堂平台，网站提供了儿童编程技能培训的相关课程，为用户提供了课程搜索、购买课程、视频学习、课程评论、考试等服务。
项目功能模块包含：
用户端：登录/注册、课程搜索、视频学习、我的订单、个人中心 
运营端：课程审核、媒资审核、题目审核、机构管理、分类管理、用户管理、权限配置、系统管理
运营端：课程审核、媒资审核、题目审核、机构管理、分类管理、用户管理、权限配置、系统管理
技术选型：SpringBoot、SpringCloud Alibaba，MySQL，Redis、RabbitMQ、MinIO、Elasticsearch、XXL-JOB、OAuth2
微服务模块 本项目采用微服务技术架构，根据业务需求，拆分为：内容管理服务、媒资管理服务、搜索服务、订单支付服务、 学习中心服务、系统管理服务、认证授权服务、网关服务、注册中心服务、配置中心服务等。 

启动：
远程连接虚拟机
使用ssh客户端工具FinalShell远程 连接 虚拟机中的CentOS系统。
IP地址：192.168.101.65
账号与密码为：root/centos
启动虚拟机中的Docker及容器
执行 systemctl start docker 启动docker。
运行： sh /data/soft/restart.sh  
查询docker容器：docker ps

远程连接数据库

运行TengMu-project项目
