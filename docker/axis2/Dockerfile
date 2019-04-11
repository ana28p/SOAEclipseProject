FROM tomcat:8.5-jre8-alpine

ENV CATALINA_BASE $CATALINA_HOME
ENV AXIS2_SERVICES $CATALINA_HOME/webapps/axis2/WEB-INF/services
ENV AXIS2_HOME $CATALINA_HOME/webapps/axis2

RUN mkdir -p /tmp/axis2 && cd /tmp/axis2 && \
    wget http://archive.apache.org/dist/axis/axis2/java/core/1.6.4/axis2-1.6.4-war.zip -O axis2.zip && \
    unzip axis2.zip && \
    cd $CATALINA_HOME/webapps && \
    cp /tmp/axis2/axis2.war . && \
    rm -rf /tmp/axis2 && \
    mkdir axis2 && unzip axis2.war -d axis2