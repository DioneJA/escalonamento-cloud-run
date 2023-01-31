
FROM traccar/traccar:5-alpine
RUN apk --no-cache add curl gettext

ENV DATABASE_IP ""
ENV DATABASE_NAME ""
ENV DATABASE_USERNAME ""
ENV DATABASE_PASSWORD ""
ENV DATABASE_PORT ""

COPY entrypoint.sh /entrypoint.sh
COPY ./traccar.env.xml /opt/traccar/conf/traccar.env.xml

CMD ["java", "-Xms1g", "-Xmx1g", "-Djava.net.preferIPv4Stack=true", "--add-opens", "jdk.zipfs/jdk.nio.zipfs=ALL-UNNAMED", "--add-opens", "java.base/jdk.internal.loader=ALL-UNNAMED", "-jar", "tracker-server.jar", "/opt/traccar/conf/traccar.xml"]

ENTRYPOINT ["/entrypoint.sh"]
