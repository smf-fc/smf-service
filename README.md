# smf-service

# 1. Development
## 1.1. Docker
### 1.1.1. MariaDB
    docker run --name smf-mariadb -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=smf-service -d mariadb -
    -character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci