#表示使用 openjdk:8u121-jre-alpine为基础镜像，如果镜像不存在服务器本地中，请先下载镜像（docker pull openjdk:8u121-jre-alpine）
FROM openjdk:8u121-jre-alpine

#MAINTAINER 后面是镜像的描述
MAINTAINER esqabc "www.esqabc.com"

#指定了临时文件目录为/tmp。其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp。改步骤是可选的，如果涉及到文件系统的应用就很有必要了。
#/tmp目录用来持久化到 Docker 数据文件夹，因为 Spring Boot 使用的内嵌 Tomcat 容器默认使用/tmp作为工作目录 
VOLUME /tmp

#将应用jar包复制到/home/apps
RUN cd /home && mkdir apps
ADD ./dockerjar-jen.jar /home/apps

#开启内部服务端口
EXPOSE 8888

#启动服务
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -Duser.timezone=GMT+08 -jar /home/apps/dockerjar-jen.jar" ]
