#Stage 1
FROM node:17-alpine as builder
WORKDIR /app
COPY package.json ./
COPY yarn.lock ./
RUN yarn install 
COPY ./ .. 
RUN yarn builder

