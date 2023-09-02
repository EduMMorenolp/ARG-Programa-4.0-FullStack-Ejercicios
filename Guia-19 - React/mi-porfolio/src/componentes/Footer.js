import React from 'react';
import "./Footer.css"



function Footer() {
  return (
    <footer className="bg-dark text-white text-center py-3">
      <div className="container">
        <p>&copy; {new Date().getFullYear()} Eduardo M Moreno. Todos los derechos reservados.</p>
      </div>
      <div className="sidebar">
        <ul>
          <li>
            <a href="https://www.linkedin.com/in/eduardo-m-moreno-programador/" rel="noreferrer">
              <i className="fab fa-linkedin"></i>
              <span className="social-name" style={{ color: '#0077B5' }}>LinkedIn</span>
            </a>
          </li>
          <li>
            <a href="https://github.com/EduMMorenolp" rel="noreferrer">
              <i className="fab fa-github"></i>
              <span className="social-name" style={{ color: '#211F1F' }}>GitHub</span>
            </a>
          </li>
          <li>
            <a href="https://www.instagram.com/edu.m.morenolp/" rel="noreferrer">
              <i className="fab fa-instagram"></i>
              <span className="social-name" style={{ color: '#E4405F' }}>Instagram</span>
            </a>
          </li>
          <li>
            <a href="https://twitter.com/EduMMorenolp" rel="noreferrer">
              <i className="fab fa-twitter"></i>
              <span className="social-name" style={{ color: '#1DA1F2' }}>Twitter</span>
            </a>
          </li>
          <li>
            <a href="https://discord.gg/BzU7nDbT" rel="noreferrer">
              <i className="fab fa-discord"></i>
              <span className="social-name" style={{ color: '#7289DA' }}>Discord</span>
            </a>
          </li>
          <li>
            <a href="https://www.youtube.com/@edummorenolp" rel="noreferrer">
              <i className="fab fa-youtube"></i>
              <span className="social-name" style={{ color: '#FF0000' }}>Youtube</span>
            </a>
          </li>
          <li>
            <a href="https://www.twitch.tv/edummorenolp" rel="noreferrer">
              <i className="fab fa-twitch"></i>
              <span className="social-name" style={{ color: '#9146FF' }}>Twitch</span>
            </a>
          </li>
        </ul>
      </div>
    </footer>

  );
}

export default Footer;
