FROM python:2
MAINTAINER Andrii Dvorzhak <dvorzhak@gmail.com>
WORKDIR /backend
ADD app /backend
RUN cd /backend
RUN pip install -r requirements.txt
ENV FLASK_APP=app.py
ENV FLASK_DEBUG=1
ENV DOCKERIZE_VERSION=v0.6.0
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz  && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz
RUN chmod 755 flask_run.sh
CMD ["sh", "./flask_run.sh"]
EXPOSE 5000
