FROM debian:stable
WORKDIR /usr/local/

# Install the database
RUN apt update
RUN apt install -y sqlite3 libsqlite3-dev sqlitebrowser

# Setup an user to not use root
RUN useradd datauser
USER datauser

CMD ["sqlite3"]
