FROM ibmcom/websphere-liberty:24.0.0.2-full-java17-openj9-ubi-amd64

ARG VERSION=1.0

COPY --chown=1001:0 src/main/liberty/config /config/
RUN features.sh
COPY --chown=1001:0 target/system.war /config/apps

RUN configure.sh