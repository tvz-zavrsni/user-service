#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE DATABASE user_service;
    GRANT ALL PRIVILEGES ON DATABASE user_service TO postgres;
EOSQL
