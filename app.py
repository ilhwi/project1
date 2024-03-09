from flask import Flask

app = Flask(__name__)

@app.route('/')
def home():
    return '<h1>Hello Falsk!</h1>'

@app.route('/bbs')
def bbs():
    return '<h1>BBS</h1>'

if __name__ =='__main__':
    app.run(host='0.0.0.0',port ='5050', debug=True)