import React from 'react';
import "./Footer.css"

function Footer() {
  const socialLinks = [
      {
          name: "LinkedIn",
          iconClass: "fab fa-linkedin",
          color: "#0077B5",
          url: "https://www.linkedin.com/in/eduardo-m-moreno-programador/",
      },
      {
          name: "GitHub",
          iconClass: "fab fa-github",
          color: "#211F1F",
          url: "https://github.com/EduMMorenolp",
      },
      {
          name: "Instagram",
          iconClass: "fab fa-instagram",
          color: "#E4405F",
          url: "https://www.instagram.com/edu.m.morenolp/",
      },
      {
          name: "Twitter",
          iconClass: "fab fa-twitter",
          color: "#1DA1F2",
          url: "https://twitter.com/EduMMorenolp",
      },
  ];

  return (
      <footer className="bg-dark text-white text-center py-3">
          <div className="container">
              <p>&copy; 2023 By Eduardo M Moreno. Todos los derechos reservados.</p>
          </div>
          <div className="sidebar">
              <ul>
                  {socialLinks.map((social, index) => (
                      <li key={index}>
                          <a href={social.url} rel="noreferrer">
                              <i className={social.iconClass}></i>
                              <span className="social-name" style={{ color: social.color }}>{social.name}</span>
                          </a>
                      </li>
                  ))}
              </ul>
          </div>
      </footer>
  );
}

export default Footer;

