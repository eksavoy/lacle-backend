ALTER TABLE students ADD COLUMN created_by BIGSERIAL;
ALTER TABLE students ADD column updated_by BIGSERIAL;
ALTER TABLE students ADD COLUMN created_at TIMESTAMP;
ALTER TABLE students ADD column updated_at TIMESTAMP;
