FROM python:2
MAINTAINER Andrii Dvorzhak <dvorzhak@gmail.com>
WORKDIR /frontend
ADD app /frontend
RUN cd /frontend
RUN pip install -r requirements.txt
ENV DOCKERIZE_VERSION=v0.6.0
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz  && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz
RUN chmod 755 django_run.sh
CMD ["sh", "./django_run.sh"]
EXPOSE 8000
