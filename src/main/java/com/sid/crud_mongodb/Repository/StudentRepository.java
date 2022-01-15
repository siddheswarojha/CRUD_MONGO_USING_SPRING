package com.sid.crud_mongodb.Repository;

import com.sid.crud_mongodb.Model.Student;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, ObjectId>{
}
