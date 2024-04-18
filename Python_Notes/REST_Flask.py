# pip install flask

from flask import Flask, request, jsonify

app = Flask(__name__)


@app.route('/', methods=['GET', 'POST'])
def home():
    if request.method == 'GET':
        return jsonify({'data': 'Hellow World'})
    if request.method == 'POST':
        data = request.get_json()
        return "My name is {}, and my age is {}".format(data['name'], data['age'])


@app.route('/calc/<int:num>', methods=['GET'])
def calc(num):
    return jsonify({'solution': num ** 2})


if __name__ == '__main__':
    app.run(debug=True)
