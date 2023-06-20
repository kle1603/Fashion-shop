<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Bakery's Login</title>

        <!-- Embed Reset -->
        <link rel="stylesheet" href="./assets/css/reset.css" />

        <!-- Embed Fonts -->
        <link rel="preconnect" href="https://fonts.googleapis.com" />
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
        <link
            href="https://fonts.googleapis.com/css2?family=Lora:wght@400;600;700&family=Syne:wght@700&display=swap"
            rel="stylesheet"
        />

        <!-- Embed Style -->
        <link rel="stylesheet" href="./assets/css/style.css" />
    </head>
    <body>
        <header class="header">
            <div class="container">
                <div class="navbar">
                    <div class="navbar__logo">
                        <img
                            src="./assets/image/logo.png"
                            alt=""
                            class="navbar__logo-img"
                        />
                    </div>
                    <div class="navbar__menu">
                        <ul class="navbar__menu-list">
                            <li>
                                <a class="navbar__menu-item" href=""
                                    >Destinations</a
                                >
                            </li>
                            <li>
                                <a class="navbar__menu-item" href="">About</a>
                            </li>
                            <li>
                                <a class="navbar__menu-item" href="">Blog</a>
                            </li>
                            <li>
                                <a class="navbar__menu-item" href="">Page</a>
                            </li>
                        </ul>
                    </div>
                    <div class="navbar__button">
                        <a href="" class="navbar__button-login">Log In</a>
                        <a
                            href="MainController?action=RegisterPage"
                            class="navbar__button-signin btn"
                            >Sign Up</a
                        >
                    </div>
                </div>
            </div>
        </header>
        <section class="signin">
            <div class="container">
                <div class="signin__inner">
                    <form
                        class="signin__form"
                        action="MainController"
                        method="POST"
                    >
                        <h1 class="signin__heading">Sign In</h1>
                        <div class="signin__social">
                            <a href="" class="signin__link">
                                <img
                                    src="./assets/icons/facebook.svg"
                                    alt=""
                                    class="facebook-img"
                                />
                                <p class="link-content">
                                    Continue with Facebook
                                </p>
                            </a>
                            <a href="" class="signin__link">
                                <img
                                    src="./assets/icons/google.svg"
                                    alt=""
                                    class="google-img"
                                />
                                <p class="link-content">Continue with Google</p>
                            </a>
                            <a href="" class="signin__link">
                                <img
                                    src="./assets/icons/apple.svg"
                                    alt=""
                                    class="apple-img"
                                />
                                <p class="link-content">Continue with Apple</p>
                            </a>
                        </div>
                        <p class="signin__option">OR</p>
                        <div class="signin__input">
                            <div>
                                <input
                                    class="section-input signin__username"
                                    type="text"
                                    name="username"
                                    required=""
                                    placeholder="Username"
                                />
                            </div>
                            <div>
                                <input
                                    class="section-input signin__password"
                                    type="password"
                                    name="password"
                                    required=""
                                    placeholder="Password"
                                />
                            </div>
                        </div>
                        <div class="signin__forget">
                            <a class="signin__forget-link" href=""
                                >Forgot password?</a
                            >
                        </div>
                        <input
                            type="submit"
                            name="action"
                            value="Sign In"
                            class="signin__button btn"
                        />
                        <p class="signin__signup">
                            Don't a have account?
                            <a
                                class="signin__signup-link"
                                href="MainController?action=RegisterPage"
                            >
                                Sign Up</a
                            >
                        </p>
                    </form>
                </div>
            </div>
        </section>
    </body>
</html>
