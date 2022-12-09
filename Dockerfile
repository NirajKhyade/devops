#Stage 1
FROM node:17-alpine as builder
WORKDIR /app
COPY package.json ./
COPY yarn.lock ./
RUN yarn install 
COPY ./ .. 
RUN yarn builder

#Stage 2
FROM nginx:1.90.0
WORKDIR /usr/share/nginx/html
RUN rm -rf ./*
COPY --from=builder /app/build .
ENTRYPOINT ["nginx","-g","daemon off;"]
