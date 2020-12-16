<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Index | Farmacia - Sistema Web Application</title>
        <meta name="description" content="Responsive, Farmacia, Inventario, Administracion">
        <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1">
        <link rel="stylesheet" href="assets/css/site.min.css">
    </head>
    <body class="layout-column bg-dark">
        <header id="header" class="page-header fixed">
            <div class="navbar navbar-expand-lg">
                <a href="index.jsp" class="navbar-brand text-white">
                    <svg width="24" height="24" viewBox="0 0 24 24" fill="none">
                    <circle cx="12" cy="12" r="10" stroke="currentColor" stroke-width="1" fill="#000"></circle>
                    <circle cx="12" cy="12" r="2" stroke="currentColor" stroke-width="1"></circle>
                    <g class="loading-spin" stroke="currentColor" stroke-width="1" style="transform-origin: 12px 12px">
                    <path d="M16.24 7.76a6 6 0 0 1 0 8.49m-8.48-.01a6 6 0 0 1 0-8.49m11.31-2.82a10 10 0 0 1 0 14.14m-14.14 0a10 10 0 0 1 0-14.14">

                    </path>
                    </g>
                    </svg> 
                    <span class="hidden-folded d-inline l-s-n-1x">Bepop</span>
                </a>
                <div class="collapse navbar-collapse order-2 order-lg-1" id="navbarCollapse">
                    <ul class="navbar-nav" data-nav>
                        <li class="nav-item">
                            <a href="index.jsp" class="nav-link">
                                <span class="nav-text">Get it</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="https://www.google.com/maps/search/UPEA%20Universidad%20Publica%20de%20El%20Alto/@-16.49399029772131,-68.19422897938145,17z?hl=es" class="nav-link no-ajax">
                                <span class="nav-text">Sucursales</span>
                            </a>
                        </li>
                    </ul>
                </div>
                <ul class="nav navbar-menu order-1 order-lg-2">
                    <li class="nav-item">
                        <a class="nav-link no-ajax" href="login.jsp">Login</a>
                    </li>
                    <li class="d-flex align-items-center">
                        <a class="btn btn-rounded btn-sm btn-primary no-ajax" href="index.jsp">Register</a>
                    </li>
                    <li class="nav-item d-lg-none">
                        <a href="index.jsp#" class="nav-link px-2" data-toggle="collapse" data-toggle-class data-target="#navbarCollapse">
                            <i data-feather="menu"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </header>
        <div id="main" class="layout-row flex">
            <div id="content" class="flex">
                <div class="sr">
                    <div class="page-hero page-container">
                        <div class="media bg-media">
                            <div class="media-content" style="background-image:url(assets/img/b2.jpg)">

                            </div>

                        </div>
                        <div class="p-5 pos-rlt text-center">
                            <h1 class="display-3 font-weight-bold text-white mb-5 mx-5">
                                Farmacia Bolivia, Cuidamos su salud.
                            </h1>
                            <a href="index.jsp" class="btn btn-md gd-primary text-white no-ajax m-2">
                                <%/*Discover new Music*/%>
                                Mision
                            </a> 
                            <a href="index.jsp" class="btn btn-md btn-outline-light m-2">
                                <%/*Purchase*/%>
                                Vision
                            </a>
                        </div>
                    </div>
                    <div class="page-container p-5 pos-rlt">
                        <div class="py-5 text-center">
                            <h2 class="display-4 font-weight-bold text-white mb-5">
                                Artists on Bepop
                            </h2>
                            <p>Find the most popular artists and listen their music on Bepop, Create your own playlist when listening to them.</p>
                            <div class="py-4">
                                <a href="index.jsp" class="btn btn-md btn-outline-primary no-ajax m-2">Explore artists</a> 
                                <a href="index.jsp" class="btn btn-md btn-outline-primary m-2">Purchase</a>
                            </div>
                        </div>
                    </div>
                    <div class="row no-gutters flex align-items-end">
                        <div class="col-2">
                            <div class="row no-gutters align-items-end">
                                <div class="col-2"><div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b0.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-10">

                                </div>
                                <div class="col-8">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b1.jpg)"></a>
                                    </div>
                                </div>
                                <div class="col-4"><div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b2.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b3.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b4.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b5.jpg)">

                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-3">
                            <div class="row no-gutters align-items-end">
                                <div class="col-3">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b6.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b7.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-7">

                                </div>
                                <div class="col-12">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b8.jpg)">

                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-3">
                            <div class="row no-gutters align-items-end">
                                <div class="col-7">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b9.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-5">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b10.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b11.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b12.jpg)">

                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-2">
                            <div class="row no-gutters align-items-end">
                                <div class="col-5">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b13.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-7">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b14.jpg)"></a>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b15.jpg)">

                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-2">
                            <div class="row no-gutters align-items-end">
                                <div class="col-2">

                                </div>
                                <div class="col-4">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b18.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b17.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b20.jpg)"></a>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b17.jpg)">

                                        </a>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="media">
                                        <a class="media-content" style="background-image: url(assets/img/b19.jpg)">

                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer id="footer" class="page-footer">
            <div class="padding bg-dark b-t">
                <div class="page-container">
                    <div class="py-5 text-inherit text-hover-primary">
                        <div class="row mb-5">
                            <div class="col-6 col-md-4">
                                <div class="mb-3">
                                    <a href="index.jsp" class="navbar-brand text-white">
                                        <svg width="48" height="48" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" fill="none">
                                        <circle cx="12" cy="12" r="10" stroke="currentColor" stroke-width="1" fill="#000">

                                        </circle>
                                        <circle cx="12" cy="12" r="2" stroke="currentColor" stroke-width="1">

                                        </circle>
                                        <g class="loading-spin" stroke="currentColor" stroke-width="1" style="transform-origin: 12px 12px">
                                        <path d="M16.24 7.76a6 6 0 0 1 0 8.49m-8.48-.01a6 6 0 0 1 0-8.49m11.31-2.82a10 10 0 0 1 0 14.14m-14.14 0a10 10 0 0 1 0-14.14">

                                        </path>
                                        </g>
                                        </svg> 
                                        <span class="hidden-folded d-inline l-s-n-1x">
                                            Bepop
                                        </span>
                                    </a>
                                </div>
                                <div class="px-1">
                                    <div class="dropdown mt-5 ml-md-5">
                                        <button class="btn w-sm btn-dark text-align-auto b-a sorting" data-toggle="dropdown">
                                            English
                                        </button>
                                        <div class="dropdown-menu">
                                            <a href="index.jsp#" class="dropdown-item">
                                                English
                                            </a> 
                                            <a href="index.jsp#" class="dropdown-item">
                                                Français
                                            </a> 
                                            <a href="index.jsp#" class="dropdown-item">
                                                日本语
                                            </a> 
                                            <a href="index.jsp#" class="dropdown-item">
                                                中文
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-6 col-md-2">
                                <h5 class="mb-3 text-muted">
                                    Pages
                                </h5>
                                <ul class="list-unstyled l-h-2x text-highlight">
                                    <li>
                                        <a href="">
                                            Artists
                                        </a>
                                    </li>
                                    <li>
                                        <a href="">
                                            Top Charts
                                        </a>
                                    </li>
                                    <li>
                                        <a href="">
                                            Genres
                                        </a>
                                    </li>
                                    <li>
                                        <a href="">
                                            About Us
                                        </a>
                                    </li>
                                    <li>
                                        <a href="">
                                            Blog
                                        </a>
                                    </li>
                                    <li>
                                        <a href="">
                                            Signin
                                        </a>
                                    </li>
                                    <li>
                                        <a href="login.jsp">
                                            Signup
                                        </a>
                                    </li>
                                </ul>
                            </div>
                            <div class="col-6 col-md-2">
                                <h5 class="mb-3 text-muted">
                                    Your Bepop
                                </h5>
                                <ul class="list-unstyled l-h-2x text-highlight">
                                    <li>
                                        <a href="">Profile</a>
                                    </li>
                                    <li>
                                        <a href="">Albums</a>
                                    </li>
                                    <li>
                                        <a href="">Tracks</a>
                                    </li>
                                    <li>
                                        <a href="">Playlist</a>
                                    </li>
                                    <li>
                                        <a href="">Liked</a>
                                    </li>
                                    <li>
                                        <a href="">
                                            Following
                                        </a>
                                    </li>
                                </ul>
                            </div>
                            <div class="col-6 col-md-2">
                                <h5 class="mb-3 text-muted">Help</h5>
                                <ul class="list-unstyled l-h-2x text-highlight">
                                    <li>
                                        <a href="">Documentation</a>
                                    </li>
                                    <li>
                                        <a href="">Changelog</a>
                                    </li>
                                    <li>
                                        <a href="">Update</a>
                                    </li>
                                </ul>
                            </div>
                            <div class="col-6 col-md-2 text-md-right">
                                <h5 class="mb-3 text-muted">Follow Us</h5>
                                <a href="index.jsp#">Fb</a> 
                                <a href="index.jsp#">Tw</a> 
                                <a href="index.jsp#">Ig</a>
                            </div>
                        </div>
                        <div class="text-center py-5">
                            <span class="text-muted text-sm">
                                &copy; Desarollador. Alex - Sistem Web Application, Farmacia.
                            </span>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <script src="assets/js/site.min.js"></script>
    </body>
</html>
