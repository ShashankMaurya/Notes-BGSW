# pip install flask

from flask import Flask, request, jsonify, redirect, url_for

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


# TODO: Made 2 endpoints, one for admin, and other for Standard user

@app.route('/admin')
def hello_admin():
    return jsonify({'message': 'Hello Admin'})


@app.route('/guest/<guest>')
def hello_guest(guest):
    return jsonify({'message': 'Hello {} as Guest'.format(guest)})


# TODO: Dynamic endpoint below, redirects to the respective endpoint based on the name, i.e., admin or guest.

@app.route('/user/<name>')
def hello_user(name):
    if name == 'admin':
        return redirect(url_for('hello_admin'))
    return redirect(url_for('hello_guest', guest=name))


if __name__ == '__main__':
    app.run(debug=True)
