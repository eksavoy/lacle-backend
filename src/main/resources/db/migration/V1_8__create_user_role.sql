CREATE TABLE user_roles (
  user_id BIGSERIAL NOT NULL,
  role_id BIGSERIAL NOT NULL,
  PRIMARY KEY (user_id, role_id)
);