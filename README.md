# Legacy Java 1.2 Demo Project


This is a **dummy legacy Java 1.2 project** created for testing Java code migration tools.


## Purpose
- Simulate real-world pre-Java-5 code
- Contain **existing legacy test cases (JUnit 3)**
- Validate test detection and rewrite logic during migration to Java 17


## Technologies Used
- Java 1.2 syntax and patterns
- JUnit 3 (`junit.framework.TestCase`)
- Ant build system


## Project Structure
legacy-java-1.2-demo/ ├─ src/main/java/com/example/legacy ├─ src/test/java/com/example/legacy └─ build.xml

## How Tests Work (Legacy)
- Tests extend `TestCase`
- No annotations
- Test methods start with `test*`


## Migration Expectations
After migration to Java 17:
- JUnit 3 → JUnit 5
- Tests rewritten (not regenerated)
- Production code modernized
- All tests pass successfully


This repository is intentionally simple and deterministic for migration validation.
