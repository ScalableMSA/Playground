#!/usr/bin/env bash

REPOSITORY=/home/ec2-user/Playground/User
LOG_FILE=$REPOSITORY/log.txt

echo "deploy.sh 시작" | sudo tee -a $LOG_FILE

cd $REPOSITORY || echo "repository 없음 $REPOSITORY" | sudo tee -a $LOG_FILE

APP_NAME=ScalableMSA-User
JAR_NAME=$(ls $REPOSITORY/build/libs/ | grep '.jar' | tail -n 1)
JAR_PATH=$REPOSITORY/build/libs/$JAR_NAME

CURRENT_PID=$(pgrep -f $APP_NAME)

if [ -z "$CURRENT_PID" ]
then
  echo "> 종료할 것 없음." | sudo tee -a $LOG_FILE
else
  echo "> kill -9 $CURRENT_PID" | sudo tee -a $LOG_FILE
  kill -9 "$CURRENT_PID"
  sleep 5
fi

echo "> $JAR_PATH 배포" | sudo tee -a $LOG_FILE
nohup java -jar -Dspring.profiles.active=prod "$JAR_PATH" > /dev/null 2> /dev/null < /dev/null &