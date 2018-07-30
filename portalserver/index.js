const express = require("express");
const app = express();
const morgan = require("morgan");
var mongoose = require('mongoose');
// const bodyParser = require('body-parser');
var bodyParser = require('body-parser');
var fs = require('fs')
var cors = require('cors');
app.use(morgan('dev'));
app.use(cors());
// app.use(bodyParser);
app.get("/", function(req,res) {
  res.json({ status: "success" });
});
app.listen(3000, "192.168.11.133", function() {
  console.log("We have started our server on port 3000");
});
