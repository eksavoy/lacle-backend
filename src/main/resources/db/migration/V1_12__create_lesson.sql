CREATE TABLE lessons(
  id BIGSERIAL NOT NULL,
  start_date TIMESTAMP NOT NULL,
  end_date TIMESTAMP NOT NULL,
  created_at TIMESTAMP,
  updated_at TIMESTAMP,
  created_by BIGSERIAL,
  updated_by BIGSERIAL,
  teacher_id BIGSERIAL NOT NULL,
  student_id BIGSERIAL NOT NULL,
  room_id BIGSERIAL NOT NULL,
  PRIMARY KEY (id)
);

