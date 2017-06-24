#!/usr/bin/env bash
if [ "$1" == 'stop' ]; then
        pid=`ps -eo pid,args | grep selenium-server-standalone-3.4.0.jar | grep -v grep | cut -c1-6`
        kill -9 $pid
        echo "Selenium Server is stopped"
elif [ "$1" == 'start' ]; then
        echo "Starting selenium server..."
        java -jar ./src/main/resources/selenium-grid/selenium-server-standalone-3.4.0.jar -role hub -port "$3" -hubConfig ./src/main/resources/selenium-grid/DefaultHub.json &
        java -Dwebdriver.gecko.driver=./src/main/resources/drivers/geckodriver -Dwebdriver.chrome.driver=./src/main/resources/drivers/chromedriver  -jar ./src/main/resources/selenium-grid/selenium-server-standalone-3.4.0.jar -role node -hub "$2":"$3" -nodeConfig ./src/main/resources/selenium-grid/WindowsNode.json &
        echo "Selenium Server is started"
else
        echo "Please pass parameters: (start | stop) host port"
fi