### Pre-requisite
Refer [here](https://ntarunmenon.gitlab.io/my-blog/2020/04/10/docker-postrge-sample-database.html)

```unix
docker run -p 7000:5432 -i   -d postgres-adventureworks
```

### Run the application

 ```unix
 $ ./mvnw spring-boot:run
 ```

### Api 

```unix
$ curl http://localhost:8080/products/
```