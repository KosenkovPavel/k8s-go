FROM golang:alpine
WORKDIR /app
COPY . .
RUN go get .
ENTRYPOINT ["go", "run", "."]