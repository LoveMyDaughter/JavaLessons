#!/ban/bash
dockerize -wait tcp://postgres-db:5432 -wait http://flask-backend:5000 -timeout 60s
python manage.py migrate
python manage.py runserver
