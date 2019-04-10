# PersonalCapital

This application serves as the solution for Personal Capital AWS Challenge. Below are the complete details about the source code and REST API Calls.

# Source Files' Description
## Config
  1. ElasticsearchConfig: Contains the configuration information for elasticsearch services hosted on AWS
    search-explorepersonalcapital-wmk2a5l5bpjpm4oersw4r2aun4.us-east-2.es.amazonaws.com
  2. SwaggerConfig: Contains the configuration information for swagger

## Model
  PlanDocument: Java Class for reprsenting the Plan information given as part of the challenge input file

## rest
  1. ParseFile: parses an input file to extract the informationa and convert them to Java class
  2. PlanController: Main controller class for receiving all REST APIs. Rest API documentation is available at http://ec2-3-17-16-176.us-east-2.compute.amazonaws.com:8081/swagger-ui.html
  3. PlanService: Backend methods to serve controller and reach out to elasticsearch when needed
  
# S3 Bucket - arn:aws:s3:::personalcapitalsourcefiles
This Bucket consists of the input file, and Index mapping for elastic search.

