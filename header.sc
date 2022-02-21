.header{
    background-color: var(--primary-color);
    border-radius: 5px;
}

.navegacion{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
}

.logo{
    display: flex;
    align-items: center;
    font-weight: bold;
    color: var(--font-color-reverse);
    margin-left: 5px;
}

.logo img{
    border-radius: 50%;
}

.menu {
    display: flex;
}

.menu li{
    padding: 0 10px;
}

@media (max-width: 760px){
    .navegacion{
        flex-direction: column;
        margin-top: 10px;
    }
}

.menu{
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    margin: 20px auto;
}

*{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
body{
    background-image: url('imagen.jpg');
}
.form-register{
    width: 400px;
    padding: 30px;
    background: #723f75;
    margin: auto;
    margin-top: 100px;
    border-radius: 4px;
    font-family: 'cambria';
    color: white;
    box-shadow: 7px 13px 37px #000;
}
.form-register h4{
    font-size: 22px;
    margin-bottom: 20px;
}
.controls{
    width: 100%;
    background: #16518b;
    padding: 10px;
    border-radius: 4px;
    margin-bottom: 16px;
    border: 1px solid #1fc593;
    font-family: 'cambria';
    font-size: 18px;
    color: white;
}
.form-register p{
    height: 40px;
    text-align: center;
    font-size: 18px;
    line-height: 40px;
}
.form-register a{
    color: white;
    text-decoration: none;
}
.form-register a:hover{
    color: white;
    text-decoration: underline;
}
.form-register .botons{
    width: 100%;
    background: #1c4e15;
    border: none;
    padding: 12px;
    color: white;
    margin: 16px 0;
    font-size: 16px;
}
